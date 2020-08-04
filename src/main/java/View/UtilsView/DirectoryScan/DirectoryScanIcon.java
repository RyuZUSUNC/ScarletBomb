package View.UtilsView.DirectoryScan;

import com.jfoenix.svg.SVGGlyph;

public class DirectoryScanIcon {
    public SVGGlyph book_mark_fill = new SVGGlyph("M20 22H6.5A3.5 3.5 0 0 1 3 18.5V5a3 3 0 0 1 3-3h14a1 1 0 0 1 1 1v18a1 1 0 0 1-1 1zm-1-2v-3H6.5a1.5 1.5 0 0 0 0 3H19zM10 4v8l3.5-2 3.5 2V4h-7z");
    public SVGGlyph save_fill = new SVGGlyph("M18 21v-8H6v8H4a1 1 0 0 1-1-1V4a1 1 0 0 1 1-1h13l4 4v13a1 1 0 0 1-1 1h-2zm-2 0H8v-6h8v6z");
    public SVGGlyph arrow_go_back = new SVGGlyph("M5.828 7l2.536 2.536L6.95 10.95 2 6l4.95-4.95 1.414 1.414L5.828 5H13a8 8 0 1 1 0 16H4v-2h9a6 6 0 1 0 0-12H5.828z");
    public SVGGlyph arrow_right = new SVGGlyph("M16.172 11l-5.364-5.364 1.414-1.414L20 12l-7.778 7.778-1.414-1.414L16.172 13H4v-2z");
    public SVGGlyph clipbord = new SVGGlyph("M6 4v4h12V4h2.007c.548 0 .993.445.993.993v16.014a.994.994 0 0 1-.993.993H3.993A.994.994 0 0 1 3 21.007V4.993C3 4.445 3.445 4 3.993 4H6zm2-2h8v4H8V2z");
    public SVGGlyph sort_desc = new SVGGlyph("M20 4v12h3l-4 5-4-5h3V4h2zm-8 14v2H3v-2h9zm2-7v2H3v-2h11zm0-7v2H3V4h11z");
    public SVGGlyph clipbord_alert = new SVGGlyph("M6 4v4h12V4h2.007c.548 0 .993.445.993.993v16.014a.994.994 0 0 1-.993.993H3.993A.994.994 0 0 1 3 21.007V4.993C3 4.445 3.445 4 3.993 4H6zm2-2h8v4H8V2z");


    public DirectoryScanIcon(){
        book_mark_fill.setSize(30,35);
        save_fill.setSize(30,32);
        clipbord.setSize(30,35);
        arrow_go_back.setSize(32,28);
        arrow_right.setSize(45,28);
        sort_desc.setSize(30,30);
        clipbord_alert.setSize(30,34);
    }
}
