package br.com.mf.util;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

public class PdfFormReader {
    public static void main(String[] args) {
        String filePath = "C:\\Ambiente\\CCB_Form.pdf"; // Altere para o caminho do seu PDF

        try (PDDocument document = Loader.loadPDF(new File(filePath))) {
            PDAcroForm acroForm = document.getDocumentCatalog().getAcroForm();

            if (acroForm != null) {
                for (PDField field : acroForm.getFields()) {
                    System.out.println("Campo: " + field.getFullyQualifiedName() + " | Valor: " + field.getValueAsString());
                }
            } else {
                System.out.println("O documento não contém um formulário preenchível.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao processar o PDF: " + e.getMessage());
        }
    }
}