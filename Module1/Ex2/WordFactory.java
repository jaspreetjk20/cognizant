package Module1.Ex2;

public class WordFactory extends DocumentFactory {

@Override
public Document createDocument() {
    return new WordDocument();
}

}
