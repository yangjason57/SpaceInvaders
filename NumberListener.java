import greenfoot.Actor;
import greenfoot.Color;
import greenfoot.Font;
import greenfoot.GreenfootImage;

public class NumberListener extends Actor
{
	
	private int value = 0;
    private String text = "";
    private int stringLength;
    
    public NumberListener(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 16;
        setImage(new GreenfootImage(stringLength, 24));
        GreenfootImage image = getImage();
        Font font = image.getFont();
        image.setFont(font.deriveFont(36.0F));  // use larger font
        image.setColor(Color.WHITE);
        
        updateImage();
    }

	public void act() {
		updateImage();
	}

    public void add(int score)
    {
        value += score;
        updateImage();
    }

    public void subtract(int score)
    {
        value -= score;
        updateImage();
    }

    public int getValue()
    {
        return value;
    }

    /**
     * Make the image
     */
    private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 2, 20);
    }
	
}
