package helo_1408;

public enum Level {
	HIGH(3),
	LOW(1),
	MEDIUM(2);
	
	private int levelCode;
	private Level(int levelCode)
	{
		this.levelCode=levelCode;
	}
    public int getLevelCode()
    {
    	return this.levelCode;
    }
}
