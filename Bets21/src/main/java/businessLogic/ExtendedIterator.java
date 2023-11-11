package businessLogic;

public interface ExtendedIterator {
	
	//uneko elementua itzultzen du eta hurrengora pasatzen da
	public Object next();
	
	//true hurrengo elementua existitzen bada.
	public boolean hasNext();
	
	//uneko elementua itzultzen du eta aurrekora pasatzen da
	public Object previous();
	
	//true aurreko elementua existitzen bada.
	public boolean hasPrevious();
	
	//Lehendabiziko elementuan kokatzen da.
	public void goFirst();
	
	//Azkeneko elementuan kokatzen da.
	public void goLast();

}
