package test;

import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

 
public class Main {
 
    public static void main(String[] args) throws Exception{
 
    	Args4jTest settings = new Args4jTest();
        CmdLineParser parser = new CmdLineParser(settings);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!! ");
        try {
            parser.parseArgument(args);
            System.out.println("settings = " + settings);
        } catch (CmdLineException e) {
            System.err.println("e = " + e.toString());
            parser.printUsage(System.out);
        }
    }


}