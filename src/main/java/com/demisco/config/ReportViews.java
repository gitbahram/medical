package com.demisco.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

import javax.sql.DataSource;

/**
 * Created by A.amouzesh on 09/12/15.
 */
@Configuration
public class ReportViews {

    @Autowired
    private DataSource dataSource;

    @Bean
    public JasperReportsPdfView regionReport(){
        JasperReportsPdfView pdfView = new JasperReportsPdfView();
        pdfView.setJdbcDataSource(dataSource);
        pdfView.setUrl("/WEB-INF/reports/report.jrxml");
        return pdfView;
    }

}
