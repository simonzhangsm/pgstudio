/*
 * PostgreSQL Studio
 * 
 * Copyright (c) 2013 - 2014, Open Source Consulting Group, Inc.
 * Copyright (c) 2012 - 2013, StormDB, Inc.
 * 
 * Permission to use, copy, modify, and distribute this software and its
 * documentation for any purpose, without fee, and without a written agreement is
 * hereby granted, provided that the above copyright notice and this paragraph and
 * the following two paragraphs appear in all copies.
 * 
 * IN NO EVENT SHALL OPEN SOURCE CONSULTING GROUP BE LIABLE TO ANY PARTY FOR
 * DIRECT, INDIRECT, SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST
 * PROFITS, ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
 * OPEN SOURCE CONSULTING GROUP HAS BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 * OPEN SOURCE CONSULTING GROUP SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING,
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A
 * PARTICULAR PURPOSE. THE SOFTWARE PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND
 * OPEN SOURCE CONSULTING GROUP HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT,
 * UPDATES, ENHANCEMENTS, OR MODIFICATIONS.
 * 
 */
package com.openscg.pgstudio.client.messages;

import com.google.gwt.core.client.JavaScriptObject;

public class IndexJsObject extends JavaScriptObject {

	protected IndexJsObject() {
    }


    public final native String getId() /*-{ return this.id}-*/;

    public final native String getName() /*-{ return this.name }-*/;
    public final native String getOwner() /*-{ return this.owner }-*/;
    public final native String getAccessMethod() /*-{ return this.access_method }-*/;
    public final native String getPrimaryKey() /*-{ return this.primary_key }-*/;
    public final native String getUnique() /*-{ return this.unique }-*/;
    public final native String getExclusion() /*-{ return this.exclusion }-*/;
    public final native String getPartial() /*-{ return this.partial }-*/;
    public final native String getDefinition() /*-{ return this.definition }-*/;

}
