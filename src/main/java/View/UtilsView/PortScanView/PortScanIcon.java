package View.UtilsView.PortScanView;

import com.jfoenix.svg.SVGGlyph;

public class PortScanIcon {
    public SVGGlyph sort_desc = new SVGGlyph("M20 4v12h3l-4 5-4-5h3V4h2zm-8 14v2H3v-2h9zm2-7v2H3v-2h11zm0-7v2H3V4h11z");
    public SVGGlyph book_mark_fill = new SVGGlyph("M20 22H6.5A3.5 3.5 0 0 1 3 18.5V5a3 3 0 0 1 3-3h14a1 1 0 0 1 1 1v18a1 1 0 0 1-1 1zm-1-2v-3H6.5a1.5 1.5 0 0 0 0 3H19zM10 4v8l3.5-2 3.5 2V4h-7z");
    public SVGGlyph clipbord = new SVGGlyph("M6 4v4h12V4h2.007c.548 0 .993.445.993.993v16.014a.994.994 0 0 1-.993.993H3.993A.994.994 0 0 1 3 21.007V4.993C3 4.445 3.445 4 3.993 4H6zm2-2h8v4H8V2z");
    public SVGGlyph clipbord_alert = new SVGGlyph("M6 4v4h12V4h2.007c.548 0 .993.445.993.993v16.014a.994.994 0 0 1-.993.993H3.993A.994.994 0 0 1 3 21.007V4.993C3 4.445 3.445 4 3.993 4H6zm2-2h8v4H8V2z");

    public PortScanIcon(){
        sort_desc.setSize(16,16);
        book_mark_fill.setSize(16,19);
        clipbord.setSize(16,19);
        clipbord_alert.setSize(30,34);
    }
}
