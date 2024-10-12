package preparation.revise_2;

public class LowCouplingDemo {

    public static void main(String[] args) {

        Printer printer = new Printer();
        ReportPrinter reportPrinter = new ReportPrinter(printer);
        reportPrinter.printReport(new Report("Hello!"));
    }

}

class Printer {
    public void print(String content) {
        System.out.println(content);
    }
}

class Report {

    private final String reportContent;

    public Report(String content) {
        this.reportContent = content;
    }

    public String getReportContent() {
        return reportContent;
    }
}

class ReportPrinter {

    private Printer printer;

    public ReportPrinter(Printer printer) {
        this.printer = printer;
    }

    public void printReport(Report report) {
        printer.print(report.getReportContent());
    }
}