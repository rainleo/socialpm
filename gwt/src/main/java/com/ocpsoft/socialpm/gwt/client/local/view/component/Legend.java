package com.ocpsoft.socialpm.gwt.client.local.view.component;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.ComplexPanel;
import com.google.gwt.user.client.ui.Widget;

public class Legend extends ComplexPanel
{
   public Legend()
   {
      setElement((Element) Document.get().createLegendElement().cast());
   }

   public Legend(String s)
   {
      this();
      getElement().setInnerText(s);
   }

   public Legend(Widget w)
   {
      this();
      super.add(w, getElement());
   }

   @Override
   public void add(Widget w)
   {
      super.add(w, getElement());
   }

   public void setInnerHTML(String html)
   {
      getElement().setInnerHTML(html);
   }

   public void setInnerText(String text)
   {
      getElement().setInnerText(text);

   }
}
