package org.rgo;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 * Hello world!
 * 
 */
public class App {

    public static void main(String[] args) throws Exception {

        // create a CharStream that reads from standard input
        ANTLRInputStream input = new ANTLRInputStream("Hosts: name=DEREZ size=3");

        // create a lexer that feeds off of input CharStream
        SearchLexer lexer = new SearchLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        SearchParser parser = new SearchParser(tokens);
        ParseTree tree = parser.search(); // begin parsing at search
        System.out.println(tree.toStringTree(parser)); // print LISP-style tree

        ParseTreeWalker walker = new ParseTreeWalker();
        SearchBaseListener searchBaseListener = new SearchBaseListener();

        System.out.println();

        walker.walk(searchBaseListener, tree);

        System.out.println();
    }
}
