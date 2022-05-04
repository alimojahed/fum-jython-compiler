package ir.fum.compiler.jython.compiler.info;

import org.antlr.v4.runtime.CharStream;

/**
 * @author Ali Mojahed on 5/4/2022
 * @project jython-compiler
 **/
public interface InfoPrinter {
    void printInfo(CharStream charStream);
}
