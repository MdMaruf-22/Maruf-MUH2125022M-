package TextEditor;

public class TextEditor {
    public static void main(String[] args) {
        Text newText = new PlainText("I am DP");
        System.out.println(newText.getDescription());
        Text boldText = new BoldTextDecorator(newText);
        System.out.println(boldText.getDescription());
        Text boldItalicText = new ItalicTextDecorator(boldText);
        System.out.println(boldItalicText.getDescription());
        Text underlinedText = new UnderlineTextDecorator(boldItalicText);
        System.out.println(underlinedText.getDescription());
    }
}
