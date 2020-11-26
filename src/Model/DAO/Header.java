/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.DAO;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.events.IEventHandler;
import com.itextpdf.kernel.events.PdfDocumentEvent;
import com.itextpdf.kernel.geom.Rectangle;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.canvas.PdfCanvas;
import com.itextpdf.layout.Canvas;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.property.TextAlignment;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Débora
 */
public class Header implements IEventHandler {
    
   
    private String titulo;

    public Header(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public void handleEvent(com.itextpdf.kernel.events.Event event) {
        try {
            PdfDocumentEvent docEvent = (PdfDocumentEvent) event;
            PdfDocument pdf = docEvent.getDocument();
            PdfPage page = docEvent.getPage();
            Rectangle pageSize = page.getPageSize();
            Canvas canvas = new Canvas(new PdfCanvas(page), pageSize);

            //pegando caminho da imagem
            URL urlImage = this.getClass().getResource("  ");
            //Construindo a imagem no PDF

            ImageData imgData;
            try {
                imgData = ImageDataFactory.create(URLDecoder.decode(urlImage.getPath(), "UTF-8"));

                Image img = new Image(imgData);
                img.setWidth(90);
                canvas.add(img);
            } catch (UnsupportedEncodingException ex) {
                Logger.getLogger(Header.class.getName()).log(Level.SEVERE, null, ex);
            }
            //Construindo o título
            canvas.setFontSize(18);
            canvas.showTextAligned(titulo, pageSize.getWidth() / 2, pageSize.getTop() - 60, TextAlignment.CENTER);
            canvas.close();

        } catch (MalformedURLException ex) {
            Logger.getLogger(Header.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}

    

