function getParentByClassName(element, className)
{
    var parent = element;

    if (className)
    {
        while (parent && parent.className != className)
        {
            parent = parent.parentNode;
        }
    }

    return parent;
}

function getFirstChildByClassRegex(element, tagName, classRegex, stopClassRegex)
{
    var match;
    var child = element.firstChild;

    while (child != null && (!child.className || !child.className.match(stopClassRegex)))
    {
        if (child.tagName && child.tagName == tagName && child.className && child.className.match(classRegex))
        {
            match = child;
            break;
        }
        else
        {
            match = getFirstChildByClassRegex(child, tagName, classRegex, stopClassRegex);

            if (match)
            {
                break;
            }
        }

        child = child.nextSibling;
    }

    return match;
}

function addEventToElement(target, eventType, func, useCapture)
{
    var result = false;

    if (target.addEventListener)
    {
        target.addEventListener(eventType, func, useCapture);
        result = true;
    }
    else if (target.attachEvent)
    {
        result = target.attachEvent("on" + eventType, func);
    }
    else
    {
        alert("Handler could not be attached");
    }

    return result;
}

function addEventToElements(targets, eventType, func, useCapture)
{
    var result = true;

    for (var i = 0; i < targets.length; i++)
    {
        result &= addEventToElement(targets[i], eventType, func, useCapture);
    }

    return result;
}

function removeEventFromElement(target, eventType, func, useCapture)
{
    var result = false;

    if (target.removeEventListener)
    {
        target.removeEventListener(eventType, func, useCapture);
        result = true;
    }
    else if (target.detachEvent)
    {
        result = target.detachEvent("on" + eventType, func);
    }
    else
    {
        alert("Handler could not be removed");
    }

    return result;
}

function removeEventFromElements(targets, eventType, func, useCapture)
{
    var result = true;

    for (var i = 0; i < targets.length; i++)
    {
        result &= removeEventFromElement(targets[i], eventType, func, useCapture);
    }

    return result;
}

function getEvent(event)
{
    if (!event)
    {
        var event = window.event;
    }

    return event;
}

function getEventSource(event)
{
    if (event.srcElement)
    {
        var source = event.srcElement;
    }
    else if (event.currentTarget)
    {
        var source = event.currentTarget;
    }
    else
    {
        alert("Event source not found!");
    }

    return source;
}

var console = new Console();

function Console()
{
    this.canvas = null;
    this.println = consolePrintln;
    this.show = consoleShow;
}

function consolePrintln(object)
{
    if (!this.canvas)
    {
        this.canvas = window.open("about:blank", "Console", "toolbar = no, width = 640, height = 480, directories = no, status = no, scrollbars = yes, resize = no, menubar = no");
    }

    this.canvas.document.write(object);
    this.canvas.document.write("<br/>");
}

function consoleShow(object)
{
    this.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    for (property in object)
    {
        this.println(property + " = " + eval("object." + property));
    }

    this.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
}
