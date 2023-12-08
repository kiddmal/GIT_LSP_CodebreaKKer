package org.howard.edu.lsp.exam.problem51;

public class Logger {
	private static Logger logger;
    private String log;
    
    private Logger() {this.log = "";}
    

    public void logMessage(String text) {
        this.log += text + "\n";
    }

    public String displayLog() {
        return("Log:\n" + log);
    }
    
    public static Logger getInstance () {
    		if (logger == null) {
    			logger = new Logger();
    		}
    		return logger;
   }
}
