package TextEditor;

public abstract class TextDecorator implements Text{
    protected Text decoratedText;
    public TextDecorator(Text decoratedText){
        this.decoratedText = decoratedText;
    }
    @Override
    public String getText(){
        return decoratedText.getText();
    }
    @Override
    public String getDescription(){
        return decoratedText.getDescription();
    }
}
