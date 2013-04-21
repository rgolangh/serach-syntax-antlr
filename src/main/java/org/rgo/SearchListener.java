// Generated from Search.g4 by ANTLR 4.0
package org.rgo;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface SearchListener extends ParseTreeListener {
	void enterCriteria(SearchParser.CriteriaContext ctx);
	void exitCriteria(SearchParser.CriteriaContext ctx);

	void enterSearch(SearchParser.SearchContext ctx);
	void exitSearch(SearchParser.SearchContext ctx);

	void enterEntity(SearchParser.EntityContext ctx);
	void exitEntity(SearchParser.EntityContext ctx);
}