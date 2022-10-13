package com.java.design.patterns.template.pattern;

public class GenerateReportTasks {
    private AuditTrail auditTrail;

    public GenerateReportTasks(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute() {
        auditTrail.record();
        System.out.println("Generate Report");
    }
}
