package TextEditor;

public class UnderlineTextDecorator extends TextDecorator{
    public UnderlineTextDecorator(Text decoratedText) {
        super(decoratedText);
    }
    @Override
    public String getDescription() {
        return decoratedText.getDescription() + ", underline";
    }
}
