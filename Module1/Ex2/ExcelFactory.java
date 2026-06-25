package Module1.Ex2;

public class ExcelFactory extends DocumentFactory {

@Override
public Document createDocument() {
    return new ExcelDocument();
}

}
