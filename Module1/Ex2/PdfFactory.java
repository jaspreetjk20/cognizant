package Module1.Ex2;

public class PdfFactory extends DocumentFactory {

@Override
public Document createDocument() {
    return new PdfDocument();
}

}
