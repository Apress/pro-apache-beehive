_menuCloseDelay=500           // The time delay for menus to remain visible on mouse out
_menuOpenDelay=150            // The time delay before menus open on mouse over
_followSpeed=5                // Follow scrolling speed
_followRate=40                // Follow scrolling Rate
_subOffsetTop=0              // Sub menu top offset
_subOffsetLeft=0            // Sub menu left offset
_scrollAmount=3               // Only needed for Netscape 4.x
_scrollDelay=20               // Only needed for Netcsape 4.x


with(dropdown=new mm_style()){
onbgcolor="#646582";
oncolor="#D8D7FF";
offbgcolor="#46475B";
offcolor="#FFFFFF";
bordercolor="#000000";
borderstyle="solid";
borderwidth=1;
padding=4;
fontsize="10px";
fontstyle="normal";
fontweight="bold";
fontfamily="Tahoma, Arial";
pagecolor="black";
pagebgcolor="#46475B";
headercolor="#BEBEBE";
headerbgcolor="#46475B";
subimage="/sampleportal/framework/skins/nexus/images/n_arrow.gif";
subimagepadding="0";
}

with(section=new mm_style()){
onbgcolor="#646582";
oncolor="#D8D7FF";
offbgcolor="#46475B";
offcolor="#FFFFFF";
bordercolor="#296488";
borderstyle="solid";
borderwidth=0;
separatorcolor="#2D729D";
separatorsize=0;
padding=0;
fontsize="3px";
fontstyle="normal";
fontfamily="Verdana, Tahoma, Arial";
pagecolor="black";
pagebgcolor="#46475B";
headercolor="#000000";
headerbgcolor="#ffffff";
}

with(milonic=new menuname("mainmenu")){
top=56;
left=5;
alwaysvisible=1;
style=section;
alignment="left";
orientation="horizontal";
aI("url=home.html;image=/sampleportal/framework/skins/nexus/images/n_home_off.gif;overimage=/sampleportal/framework/skins/nexus/images/n_home_on.gif;")
aI("image=/sampleportal/framework/skins/nexus/images/n_news_off.gif;showmenu=news;url=news/index.html;overimage=/sampleportal/framework/skins/nexus/images/n_news_on.gif;")
aI("image=/sampleportal/framework/skins/nexus/images/n_tools_off.gif;showmenu=tools;url=tools/index.html;overimage=/sampleportal/framework/skins/nexus/images/n_tools_on.gif;")
aI("image=/sampleportal/framework/skins/nexus/images/n_applications_off.gif;showmenu=applications;url=applications/index.html;overimage=/sampleportal/framework/skins/nexus/images/n_applications_on.gif;")
aI("image=/sampleportal/framework/skins/nexus/images/n_divisions_off.gif;showmenu=divisions;url=divisions/index.html;overimage=/sampleportal/framework/skins/nexus/images/n_divisions_on.gif;")
aI("image=/sampleportal/framework/skins/nexus/images/n_products_off.gif;showmenu=products;url=products/index.html;overimage=/sampleportal/framework/skins/nexus/images/n_products_on.gif;")
aI("image=/sampleportal/framework/skins/nexus/images/n_employee_off.gif;showmenu=employee;url=employee/index.html;overimage=/sampleportal/framework/skins/nexus/images/n_employee_on.gif;")
}

with(milonic=new menuname("news")){
top=73;
left=57;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Company News;url=news/companynews.html;")
aI("text=&nbsp;&nbsp;World & Industry;url=news/worldindustry.html;")
aI("text=&nbsp;&nbsp;Press Releases;url=news/pressreleases.html;")
aI("text=&nbsp;&nbsp;Newsletters;url=news/newsletters.html;")
}

with(milonic=new menuname("tools")){
top=73;
left=108;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Staff Directory;url=tools/staffdirectory.html;")
aI("text=&nbsp;&nbsp;Workspaces;url=tools/workspaces.html;")
aI("text=&nbsp;&nbsp;Projects;url=tools/projects.html;")
aI("text=&nbsp;&nbsp;Documents;url=tools/documents.html;")
aI("text=&nbsp;&nbsp;Links;url=tools/links.html;")
aI("text=&nbsp;&nbsp;Mail & Calendar;url=tools/mailcalendar.html;")
aI("text=&nbsp;&nbsp;Message Boards;url=tools/messageboards.html;")
aI("text=&nbsp;&nbsp;Polls & Surveys;url=tools/polls.html;")
}

with(milonic=new menuname("applications")){
top=73;
left=166;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;My Top 5:;url=#;type=header;")
aI("text=&nbsp;&nbsp;&nbsp;&nbsp;GPMS;url=applications/gpms.html;")
aI("text=&nbsp;&nbsp;&nbsp;&nbsp;Interplan;url=applications/interplan.html;")
aI("text=&nbsp;&nbsp;&nbsp;&nbsp;SPIRIT;url=applications/spirit.html;")
aI("text=&nbsp;&nbsp;&nbsp;&nbsp;Cinestor;url=applications/cinestor.html;")
aI("text=&nbsp;&nbsp;&nbsp;&nbsp;TIGRES;url=applications/tigres.html;")
aI("text=&nbsp;&nbsp;More Applications...;url=applications/index.html;")
}

with(milonic=new menuname("divisions")){
top=73;
left=268;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Corporate;showmenu=corp;url=divisions/corp.html")
aI("text=&nbsp;&nbsp;Production;showmenu=prod;url=divisions/prod.html")
aI("text=&nbsp;&nbsp;Motion Pictures;showmenu=mp;url=divisions/mp.html")
aI("text=&nbsp;&nbsp;Television;showmenu=tv;url=divisions/tv.html")
aI("text=&nbsp;&nbsp;Home Entertainment;showmenu=he;url=divisions/he.html")
}

with(milonic=new menuname("corp")){
top=73;
left=419;
itemwidth=220;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Corporate Communications;url=divisions/c_corpcomm.html;")
aI("text=&nbsp;&nbsp;Corporate Credit & Customer Finance;url=divisions/c_corpcredit.html;")
aI("text=&nbsp;&nbsp;External Affairs;url=divisions/c_externalaffairs.html;")
aI("text=&nbsp;&nbsp;Financial Systems & Procedures;url=divisions/c_financial.html;")
aI("text=&nbsp;&nbsp;Information Technology;url=divsions/c_it.html;")
aI("text=&nbsp;&nbsp;Legal;url=divisions/c_legal.html;")
aI("text=&nbsp;&nbsp;Payroll;url=divisions/c_payroll.html;")
aI("text=&nbsp;&nbsp;Records & Information Management;url=divisions/c_records.html;")
aI("text=&nbsp;&nbsp;Security\, Environmental Health & Safety;url=divisions/c_security.html;")
aI("text=&nbsp;&nbsp;Treasury;url=divisions/c_treasury.html;")
aI("text=&nbsp;&nbsp;TV Credit & Customer Finance;url=divisions/c_tvcredit.html;")
}

with(milonic=new menuname("prod")){
left=419;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Sony Pictures Studios;url=divisions/p_spstudios.html;")
aI("text=&nbsp;&nbsp;The Culver Studios;url=divisions/p_culverstudios.html;")
aI("text=&nbsp;&nbsp;Sony Pictures Digital;url=divisions/p_spd.html;")
}

with(milonic=new menuname("mp")){
left=419;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Finance;url=divisions/m_finance.html;")
aI("text=&nbsp;&nbsp;Marketing;url=divisions/m_marketing.html;")
aI("text=&nbsp;&nbsp;Sales;url=divisions/prod/m_sales.html;")
aI("text=&nbsp;&nbsp;International;url=divisions/m_international.html;")
}

with(milonic=new menuname("tv")){
left=419;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Finance;url=divisions/t_finance.html;")
aI("text=&nbsp;&nbsp;Marketing;url=divisions/t_marketing.html;")
aI("text=&nbsp;&nbsp;Sales;url=divisions/t_sales.html;")
aI("text=&nbsp;&nbsp;International;url=divisions/t_international.html;")
}

with(milonic=new menuname("he")){
left=419;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Finance;url=divisions/h_finance.html;")
aI("text=&nbsp;&nbsp;Marketing;url=divisions/h_marketing.html;")
aI("text=&nbsp;&nbsp;Sales;url=divisions/h_sales.html;")
aI("text=&nbsp;&nbsp;International;url=divisions/h_international.html;")
}

with(milonic=new menuname("products")){
top=73;
left=344;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Movies;url=products/movies.html;")
aI("text=&nbsp;&nbsp;TV Shows;url=products/tvshows.html;")
aI("text=&nbsp;&nbsp;DVD & Video;url=products/dvd.html;")
aI("text=&nbsp;&nbsp;Games & Digital;url=products/games.html;")
}

with(milonic=new menuname("employee")){
top=73;
left=426;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Human Resources;showmenu=hr;url=employee/hr.html")
aI("text=&nbsp;&nbsp;Information Technology;showmenu=it;url=employee/it.html")
aI("text=&nbsp;&nbsp;Services;showmenu=services;url=employee/services.html")
aI("text=&nbsp;&nbsp;Location Guide;showmenu=location;url=employee/locations.html")
}

with(milonic=new menuname("hr")){
top=73;
left=577;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;HR Connection;url=employee/hrconnection.html;")
aI("text=&nbsp;&nbsp;Job Postings;url=employee/jobpostings.html;")
aI("text=&nbsp;&nbsp;Training;url=employee/hr_training.html;")
aI("text=&nbsp;&nbsp;Employee Handbook;url=employee/handbook.html;")
aI("text=&nbsp;&nbsp;Benefits Guide;url=employee/benefits.html;")
aI("text=&nbsp;&nbsp;Workers Union;url=emplolyee/union.html;")
aI("text=&nbsp;&nbsp;Forms Bin;url=employee/formsbin.html;")
aI("text=&nbsp;&nbsp;Vendor Links;url=employee/vendorlinks.html;")
}

with(milonic=new menuname("it")){
left=577;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Desktop Support;url=employee/desktopsupport.html;")
aI("text=&nbsp;&nbsp;Training;url=employee/it_training.html;")
aI("text=&nbsp;&nbsp;FAQ;url=employee/it_faq.html;")
}

with(milonic=new menuname("services")){
left=577;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Travel & Expenses;url=employee/travel.html;")
aI("text=&nbsp;&nbsp;On-Boarding;url=employee/onboarding.html;")
aI("text=&nbsp;&nbsp;Security;url=employee/security.html;")
aI("text=&nbsp;&nbsp;Procurement;url=employee/procurement.html;")
aI("text=&nbsp;&nbsp;Credit Union;url=employee/creditunion.html;")
aI("text=&nbsp;&nbsp;Training;url=employee/training.html;")
aI("text=&nbsp;&nbsp;Dining;url=employee/dining.html;")
aI("text=&nbsp;&nbsp;Shopping;url=employee/shopping.html;")
aI("text=&nbsp;&nbsp;Employee Screenings;url=employee/employeescreenings.html;")
aI("text=&nbsp;&nbsp;Volunteering;url=employee/volunteering.html;")
aI("text=&nbsp;&nbsp;Athletic Clubs;url=employee/athleticclubs.html;")
}

with(milonic=new menuname("location")){
left=577;
itemwidth=150;
borderwidth=1;
style=dropdown;
alignment="left";
aI("text=&nbsp;&nbsp;Sony Pictures Studios;url=employee/spstudios.html;")
aI("text=&nbsp;&nbsp;The Culver Studios;url=employee/culverstudios.html;")
aI("text=&nbsp;&nbsp;Culver City;url=employee/culvercity.html;")
aI("text=&nbsp;&nbsp;Africa;url=employee/africa.html;")
aI("text=&nbsp;&nbsp;Asia & Pacific;url=employee/asia.html;")
aI("text=&nbsp;&nbsp;Europe;url=employee/europe.html;")
aI("text=&nbsp;&nbsp;North America;url=employee/northamerica.html;")
aI("text=&nbsp;&nbsp;South America;url=employee/southamerica.html;")
}

drawMenus();