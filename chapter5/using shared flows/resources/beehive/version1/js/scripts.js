var detect = navigator.userAgent.toLowerCase();
var OS,browser,version,total,thestring;

if (checkIt('konqueror'))
{
	browser = "Konqueror";
	OS = "Linux";
}
else if (checkIt('omniweb')) browser = "OmniWeb"
else if (checkIt('opera')) browser = "Opera"
else if (checkIt('webtv')) browser = "WebTV";
else if (checkIt('icab')) browser = "iCab"
else if (checkIt('msie')) browser = "Internet Explorer"
else if (detect('firefox')) browser = "Firefox";
else if (checkIt('safari'))
{
	browser = "Safari";
	version = detect.charAt(8);
}
else if (!checkIt('compatible'))
{
	browser = "Netscape Navigator"
	version = detect.charAt(8);
}
else browser = "An unknown browser";

if (!version) version = detect.charAt(place + thestring.length);

if (!OS)
{
	if (checkIt('linux')) OS = "Linux";
	else if (checkIt('x11')) OS = "Unix";
	else if (checkIt('mac')) OS = "Mac"
	else if (checkIt('win')) OS = "Windows"
	else OS = "an unknown operating system";
}

function checkIt(string)
{
	place = detect.indexOf(string) + 1;
	thestring = string;
	return place;
}

function init() {
  setTimeout("window.onresize = redo", 1000);
}

function redo() {
  window.location.reload();
}

if (browser == "Netscape Navigator") {
	location='/mySpt/framework/skins/myspt/upgrade.html';
}

function external() {
	extWindow = window.open('','second','toolbar=yes,status=yes,scrollbars=yes,location=yes,menubar=yes,directories=yes,resizable=yes');
	extWindow.focus();
}

function popHelp(width,height) {
	var args = 'width='+width+',height='+height+',resizable=yes,scrollbars=auto';
	popWindow = window.open('MYSPT Help','popup',args);
	popWindow.focus();
}

function pop(width,height) {
	var args = 'width='+width+',height='+height+',resizable=yes,scrollbars=auto';
	popWindow = window.open('','popup',args);
	window.name = 'main';
	popWindow.focus();
}

function confirmDelete(selection) {
    if(confirm(selection)) {
        return true;
    } else {
        return false;
    }
}

// flash detection stuff here

var requiredVersion = 5;
var useRedirect = false;
var flash2Installed = false;
var flash3Installed = false;
var flash4Installed = false;
var flash5Installed = false;
var flash6Installed = false;
var maxVersion = 6;
var actualVersion = 0;
var hasRightVersion = false;
var jsVersion = 1.0;

jsVersion = 1.1;

if(browser == "Internet Explorer" && OS == "Windows"){
  document.write('<SCR' + 'IPT LANGUAGE=VBScript\> \n');
  document.write('on error resume next \n');
  document.write('flash2Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.2"))) \n');
  document.write('flash3Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.3"))) \n');
  document.write('flash4Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.4"))) \n');
  document.write('flash5Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.5"))) \n');
  document.write('flash6Installed = (IsObject(CreateObject("ShockwaveFlash.ShockwaveFlash.6"))) \n');
  document.write('</SCR' + 'IPT\> \n'); // break up end tag so it doesn't end our script
}

function detectFlash() {
  // If navigator.plugins exists...
  if (navigator.plugins) {
    // ...then check for flash 2 or flash 3+.
    if (navigator.plugins["Shockwave Flash 2.0"]
        || navigator.plugins["Shockwave Flash"]) {

      // Some version of Flash was found. Time to figure out which.

      // Set convenient references to flash 2 and the plugin description.
      var isVersion2 = navigator.plugins["Shockwave Flash 2.0"] ? " 2.0" : "";
      var flashDescription = navigator.plugins["Shockwave Flash" + isVersion2].description;

      // DEBUGGING: uncomment next line to see the actual description.
      // alert("Flash plugin description: " + flashDescription);

      // A flash plugin-description looks like this: Shockwave Flash 4.0 r5
      // We can get the major version by grabbing the character before the period
      // note that we don't bother with minor version detection.
      // Do that in your movie with $version or getVersion().
      var flashVersion = parseInt(flashDescription.charAt(flashDescription.indexOf(".") - 1));

      // We found the version, now set appropriate version flags. Make sure
      // to use >= on the highest version so we don't prevent future version
      // users from entering the site.
      flash2Installed = flashVersion == 2;
      flash3Installed = flashVersion == 3;
      flash4Installed = flashVersion == 4;
      flash5Installed = flashVersion == 5;
      flash6Installed = flashVersion >= 6;
    }
  }

  // Loop through all versions we're checking, and
  // set actualVersion to highest detected version.
  for (var i = 2; i <= maxVersion; i++) {
    if (eval("flash" + i + "Installed") == true) actualVersion = i;
  }

  // If we're on webtv, the version supported is 2 (pre-summer2000,
  // or 3, post-summer2000). Note that we don't bother sniffing varieties
  // of webtv. You could if you were sadistic...
  if(navigator.userAgent.indexOf("WebTV") != -1) actualVersion = 3;

  // DEBUGGING: uncomment next line to display flash version
  // alert("version detected: " + actualVersion);


  // We're finished getting the version on all browsers that support detection.
  // Time to take the appropriate action.

  // If the user has a new enough version...
  if (actualVersion >= requiredVersion) {
    // ...then we'll redirect them to the flash page, unless we've
    // been told not to redirect.
    if (useRedirect) {
      // Need javascript1.1 to do location.replace
      if(jsVersion > 1.0) {
        // It's safe to use replace(). Good...we won't break the back button.
        window.location.replace(flashPage);
      } else {
        // JavaScript version is too old, so use .location to load
        // the flash page.
        window.location = flashPage;
      }
    }

    // If we got here, we didn't redirect. So we make a note that we should
    // write out the object/embed tags later.
    hasRightVersion = true;
  } else {
    // The user doesn't have a new enough version.
    // If the redirection option is on, load the appropriate alternate page.
    if (useRedirect) {
      // Do the same .replace() call only if js1.1+ is available.
      if(jsVersion > 1.0) {
        window.location.replace((actualVersion >= 2) ? upgradePage : noFlashPage);
      } else {
        window.location = (actualVersion >= 2) ? upgradePage : noFlashPage;
      }
    }
  }
}

function timeoutmsg() {
    alert('Your online session has been timed out. As a security precaution, sessions are ended after a period of inactivity. Your browser window will close now.  Please open a new browser to resume using mySPT.');
    window.close();
}

// multiselect functions

function SelectAllList(CONTROL){
    for(var i = 0;i < CONTROL.length;i++){
        CONTROL.options[i].selected = true;
    }
}

function DeselectAllList(CONTROL){
    for(var i = 0;i < CONTROL.length;i++){
        CONTROL.options[i].selected = false;
    }
}

/* date handling stuff
offset is offset from current [year,month,week,day]
range is how many [years,months,weeks,days] you want
target1 and target2 are the input field names you want to populate
*/

function getyears(offset,range,target1,target2) {
	date = new Date();
	var year = date.getYear() + offset;
    if(year<1000) year+=1900;
	var date1 = Date.UTC(year,0,1) + 86400000;
	var date2 = Date.UTC((year+range),0,1);
	dtFormat(date1,target1);
	dtFormat(date2,target2);
}
function getmonths(offset,range,target1,target2) {
	date = new Date();
	var year = date.getYear();
    if(year<1000) year+=1900;
	var month = date.getMonth() + offset;
	var date1 = Date.UTC(year,month,1) + 86400000;
	var date2 = Date.UTC(year,(month+range),1);
	dtFormat(date1,target1);
	dtFormat(date2,target2);
}
function getweeks(offset,range,target1,target2) {
	date = new Date();
	var wday = date.getDay();
	var year = date.getYear();
    if(year<1000) year+=1900;
	var month = date.getMonth();
	var day = date.getDate();
	var date1 = (Date.UTC(year,month,day) - (wday*86400000) + (offset*7*86400000) + 86400000);
	var date2 = (Date.UTC(year,month,day) + ((6-wday)*86400000) + (offset*7*range*86400000) + 86400000);
	dtFormat(date1,target1);
	dtFormat(date2,target2);
}
function getNextdays(offset,range,target1,target2) {
	date = new Date();
	var year = date.getYear();
    if(year<1000) year+=1900;
	var month = date.getMonth();
	var day = date.getDate() + offset;
	var date1 = Date.UTC(year,month,day) + 86400000;
	var date2 = Date.UTC(year,month,day) + 86400000*(1+range);
	dtFormat(date1,target1);
	dtFormat(date2,target2);
}
function GetMonth(intMonth) {
	var MonthArray = new Array("January", "February", "March",
							   "April", "May", "June",
							   "July", "August", "September",
							   "October", "November", "December");
	return MonthArray[intMonth];
}
function returndate() {
	var date = new Date();
	var year = date.getYear();
    if(year<1000) year+=1900;
	var todayStr = GetMonth(date.getMonth()) + " " + date.getDate();
	todayStr += ", " + year;
	return todayStr;
}
function dtFormat(rawdate,target) {
	date = new Date(rawdate);
	var year = date.getYear();
    if(year<1000) year+=1900;
	var month = date.getMonth() + 1;
	var day = date.getDate();
	target.value = ((month < 10) ? '0' + month : month) +
                            '/' +  ((day < 10) ? '0' + day : day)+
                            '/' + ((year < 1000) ? year + 1900 : year);
}

detectFlash();  // call our detector now that it's safely loaded.

if(document.images) {
	myspt_off=new Image();
	myspt_on=new Image();
	dashboards_off=new Image();
	dashboards_on=new Image();
	tools_off=new Image();
	tools_on=new Image();
	admin_off=new Image();
	admin_on=new Image();
	b2bportal_off=new Image();
	b2bportal_on=new Image();
	help_off=new Image();
	help_on=new Image();
	logout_off=new Image();
	logout_on=new Image();
	products_off=new Image();
	products_on=new Image();    
	research_off=new Image();
	research_on=new Image(); 
	news_off=new Image();
	news_on=new Image();      

	myspt_off.src="/mySpt/framework/skins/myspt/images/n_myspt_off.gif";
	myspt_on.src="/mySpt/framework/skins/myspt/images/n_myspt_on.gif";
	dashboards_off.src="/mySpt/framework/skins/myspt/images/n_dashboards_off.gif";
	dashboards_on.src="/mySpt/framework/skins/myspt/images/n_dashboards_on.gif";
	tools_off.src="/mySpt/framework/skins/myspt/images/n_tools_off.gif";
	tools_on.src="/mySpt/framework/skins/myspt/images/n_tools_on.gif";
	admin_off.src="/mySpt/framework/skins/myspt/images/n_admin_off.gif";
	admin_on.src="/mySpt/framework/skins/myspt/images/n_admin_on.gif";
	b2bportal_off.src="/mySpt/framework/skins/myspt/images/n_b2bportal_off.gif";
	b2bportal_on.src="/mySpt/framework/skins/myspt/images/n_b2bportal_on.gif";
	help_off.src="/mySpt/framework/skins/myspt/images/n_help_off.gif";
	help_on.src="/mySpt/framework/skins/myspt/images/n_help_on.gif";
	logout_off.src="/mySpt/framework/skins/myspt/images/n_logout_off.gif";
	logout_on.src="/mySpt/framework/skins/myspt/images/n_logout_on.gif";
	products_off.src="/mySpt/framework/skins/myspt/images/n_products_off.gif";
	products_on.src="/mySpt/framework/skins/myspt/images/n_products_on.gif";
    research_off.src="/mySpt/framework/skins/myspt/images/n_research_off.gif";
	research_on.src="/mySpt/framework/skins/myspt/images/n_research_on.gif";
    news_off.src="/mySpt/framework/skins/myspt/images/n_news_off.gif";
	news_on.src="/mySpt/framework/skins/myspt/images/n_news_on.gif";
}
var outfield = 'null';