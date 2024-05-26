package TextEditor;

public class BoldTextDecorator extends TextDecorator {
    public BoldTextDecorator(Text decoratedText) {
        super(decoratedText);
    }

    @Override
    public String getDescription() {
        return decoratedText.getDescription() + ", bold";
    }
}
