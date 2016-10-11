/*
 * Copyright 2004 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * $Header:$
 */

/* ==========================================================
 *
 *
 *
 * ==========================================================
 */
function NetUIFilterURL() {
  this._urlParams = new Array();
  this._filters = new Array();
}

/* return void */
NetUIFilterURL.prototype.init = function(search) {
  /* todo: parse the URL into its component key/value pairs */
  var qIndex = search.indexOf('?') + 1;
  var paramsArray = search.substring(qIndex).split('&');
  var array = new Array();
  for(var i = 0; i < paramsArray.length; i++) {
    var eIndex = paramsArray[i].indexOf('=');
    var key = paramsArray[i].substring(0,eIndex);
    var value = paramsArray[i].substring(eIndex+1);
   
    if(key == NetUIFilterList.FILTER_KEY) {
      //alert('add filter: ' + value);
      var filter = NetUIFilterList.parse(value);
      this._filters[this._filters.length] = filter;
    }
    else {
      //alert('add URL param: ' + value);
      var param = new NetUIUrlParam(key,value);
      this._urlParams[this._urlParams.length] = param;
    }
  }
}

/* todo: remove this method in favor of processing by the caller */
NetUIFilterURL.prototype.removeUrlParam = function(key) {
  for(var i = 0; i < this._urlParams.length; i++) {
    if(this._urlParams[i].getKey() == key) {
      /*
        this is a hack to simulate removing an element from the array
        todo: need to implement real delete here
       */
      this._urlParams[i].setKey('');
    }
  }
}

/* return NetUIFilterList */
NetUIFilterURL.prototype.lookupFiltersForDataGrid = function(dataGridName) {
  
  for(var i = 0; i < this._filters.length; i++) {
    //alert('check filter: ' + this._filters[i].toUrlParam());
    if(this._filters[i].getDataGridName() == dataGridName) 
      return this._filters[i];
  }

  return null;
}

NetUIFilterURL.prototype.hasFiltersForDataGrid = function(dataGridName) {
  var filters = this.lookupFiltersForDataGrid(dataGridName);
  return (filters != null ? true : false);
}

/* return String */
NetUIFilterURL.prototype.toQueryString = function() {
  
  qs = '?';
  for(var i = 0; i < this._urlParams.length; i++) {
    var p = this._urlParams[i].toUrlParam();
    if(p == null)
      continue;

    if(i > 0)
      qs += '&';
    qs += this._urlParams[i].toUrlParam();
  }

  if(qs.length > 1)
    qs += '&';

  for(var i = 0; i < this._filters.length; i++) {
    /* allow parameters to return null to indicate that there's no parameter to add */
    var p = this._filters[i].toUrlParam();
    if(p == null)
      continue;

    if(i > 0)
      qs += '&';
    //alert('NetUIFilterURL::toQueryString:filter:\"' + p + '\"');
    qs += p;
  }

  return qs;
}

NetUIFilterURL.prototype.addFilterList = function(netuiFilterList) {
  this._filters[this._filters.length] = netuiFilterList;
}

/* ==========================================================
 *
 *
 *
 * ==========================================================
 */
function NetUIUrlParam(key,value) {
  this._key = key;
  this._value = value;
}

NetUIUrlParam.prototype.getKey = function() {
  return this._key;
}

NetUIUrlParam.prototype.setKey = function(key) {
  this._key = key;
}

NetUIUrlParam.prototype.getValue = function() {
  return this._value;
}

NetUIUrlParam.prototype.setValue = function(value) {
  this._value = value;
}

NetUIUrlParam.prototype.toUrlParam = function() {
  if(this._key == null || this._key == '')
    return null;
  else return this._key + '=' + this._value;
}

/* ==========================================================
 *
 *
 *
 * ==========================================================
 */
function NetUIFilterList(dataGridName) {
  this._dataGridName = dataGridName;
  this._filters = new Array();
}

function NetUIFilterList_parse(value) {
  var decodedValue = decodeURIComponent(value);
  var scIndex = decodedValue.indexOf(';');
  var dataGridName = decodedValue.substring(0, scIndex);
  var filter = new NetUIFilterList(dataGridName);

  var filterArray = decodedValue.substring(scIndex+1).split(',');
  for(var i = 0; i < filterArray.length; i++) {
    var parts = filterArray[i].split('~');
    filter.addFilter(parts[0],parts[1],parts[2]);
  }

  return filter;
}

NetUIFilterList.parse = NetUIFilterList_parse;
NetUIFilterList.FILTER_KEY = "netui_filter";

NetUIFilterList.prototype.getDataGridName = function() {
  return this._dataGridName;
}

/* return void */
NetUIFilterList.prototype.addFilter = function(fExpr,fOp,fVal) {
  this._filters[this._filters.length] = new NetUIFilter(fExpr,fOp,fVal);
}

NetUIFilterList.prototype.replaceFilters = function(netuiFilterArray) {
  this._filters = netuiFilterArray;
}

/* return String */
NetUIFilterList.prototype.toUrlParam = function() {
  if(this._filters == null || this._filters.length == 0)
    return null;

  var paramValue = '';
  var foundFilter = false;

  paramValue += this._dataGridName;
  paramValue += ';';
  for(var i = 0; i < this._filters.length; i++) {
    var p = this._filters[i].toUrlParam();
    if(p == null)
      continue;

    if(foundFilter && i > 0)
      paramValue += ',';
    paramValue += p;
    foundFilter = true;
  }

  if(!foundFilter)
    return null;
  else return NetUIFilterList.FILTER_KEY + '=' + paramValue;
}

/* return NetUIFilterList */
NetUIFilterList.prototype.lookupFiltersForFilterExpression = function(filterExpression) {
  var filters = new Array();
  for(var i = 0; i < this._filters.length; i++) {
    if(this._filters[i].getFilterExpression() == filterExpression)
      filters[filters.length] = this._filters[i];
  }

  return filters;
}

/* ==========================================================
 *
 *
 *
 * ==========================================================
 */
function NetUIFilter(fExpr,fOp,fVal) {
  this._fExpr = fExpr;
  this._fOp = fOp;
  this._fVal = fVal;
}

NetUIFilter.prototype.getFilterExpression = function() {
 return this._fExpr;
}

NetUIFilter.prototype.getFilterOperation = function() {
 return this._fOp;
}

NetUIFilter.prototype.getFilterValue = function() {
 return this._fVal;
}

NetUIFilter.prototype.toUrlParam = function() {
  if(this._fVal == null || this._fVal == '' ||
     this._fOp == null || this._fOp == '' ||
     this._fExpr == null || this._fExpr == '')
    return null;

  var val = this._fVal;
  if(this._fOp == 'isempty' || this._fOp == 'isnotempty')
    val = '*';

  var op = (this._fOp != null ? this._fOp : '');

  var filter = this._fExpr + '~' + op + '~' + val

  return filter;
}

/* ==========================================================
 *
 *
 *
 * ==========================================================
 */
 /*
   todo: switch over to using this URL method once the urlParams / filters have
         been merged in the NetUIFilterUrl class
  */
function buildURL(params) {
  if(params == null || params.length == 0)
    return '';

  var qs = '?';
  for(var i = 0; i < params.length; i++) {
    var p = params[i].toUrlParam();
    if(p == null)
      continue;

    if(i > 0)
      qs += '&';
    qs += params[i].toUrlParam();
  }

  return qs;
}

/* ==========================================================
 *
 * Utility method that will load a list of HTML form <inputs>
 * with filter information out of the URL.  The HTML ids of
 * the <input> elements must match filter expressions in the
 * URL's filter parameters.
 *
 * ==========================================================
 */
function doLoadNetUIFilters(formTagId, gridName) {
  var form = document.getElementById(formTagId);
  if(form == null)
    alert('could not find form with id: ' + formTagId);

  var netuiUrl = new NetUIFilterURL();
  netuiUrl.init(window.location.search);
  var gridFilters = netuiUrl.lookupFiltersForDataGrid(gridName);
  if(gridFilters == null)
    return;

  var elems = form.elements.length;
  for(var i = 0; i < elems; i++) {
    var widget = form.elements[i];

    if(widget.type == "submit" || widget.type == "hidden")
      continue;

    var id = widget.id;
    var savedFilters = gridFilters.lookupFiltersForFilterExpression(id);
    if(savedFilters != null)
      widget.value = savedFilters[0].getFilterValue();
  }
  return;
}

/* ==========================================================
 *
 * Utility method that will create a filter URL from given
 * an HTML form.  This method walks the <input> elements
 * in the form and builds a filter operation from the
 * values therein.  The default filter operation used here
 * is 'contains'.
 *
 * Once the filters have been constructed, the filter URL
 * is used to directly replace the URL in browser's current
 * window.
 *
 * ==========================================================
 */
function doNetUIFilters(formTagId, gridName) {
  var form = document.getElementById(formTagId);
  if(form == null)
    alert('could not find form with id: ' + formTagId);

  var netuiUrl = new NetUIFilterURL();
  netuiUrl.init(window.location.search);
  var gridFilters = netuiUrl.lookupFiltersForDataGrid(gridName);
  if(gridFilters == null) {
    gridFilters = new NetUIFilterList(gridName);
    netuiUrl.addFilterList(gridFilters);
  }

  var filters = new Array();
  var elems = form.elements.length;
  for(var i = 0; i < elems; i++) {
    var widget = form.elements[i];

    if(widget.type == "submit" || widget.type == "hidden")
      continue;

    var filter = new NetUIFilter(widget.id, 'contains', widget.value);
    filters[filters.length] = filter;
  }

  gridFilters.replaceFilters(filters);
  var search = netuiUrl.toQueryString();
  /* set the window's location */
  if(search != null && search.indexOf('?') < 0)
    search += '?' + search;
  window.location = window.location.protocol + "//" + location.host + window.location.pathname + (search != null ? search : '');

  return false;
}