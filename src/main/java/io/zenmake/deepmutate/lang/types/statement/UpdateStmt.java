package io.zenmake.deepmutate.lang.types.statement;

/**
 * Created by Talal Ahmed on 04/02/2023
 */
public class UpdateStmt {

    private String pattern;

    public UpdateStmt() {
    }

    public UpdateStmt(String pattern) {
        this.pattern = pattern;
    }

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
