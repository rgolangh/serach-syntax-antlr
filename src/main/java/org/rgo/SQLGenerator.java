package org.rgo;

public class SQLGenerator  extends SearchBaseListener {
    @Override public void enterCriteria(SearchParser.CriteriaContext ctx) {
        System.out.print(" -" + ctx.+ "- ");
        if (ctx.getChildCount() > 1) {
            System.out.print(" WHERE" );
        }
        System.out.print(" AND ");
        System.out.print(ctx.getText());
    }
    @Override public void exitCriteria(SearchParser.CriteriaContext ctx) { }

    @Override public void enterSearch(SearchParser.SearchContext ctx) {
        System.out.print("SELECT * from ");
    }
    @Override public void exitSearch(SearchParser.SearchContext ctx) {}

    @Override public void enterEntity(SearchParser.EntityContext ctx) {
        System.out.print(ctx.getText());

}
