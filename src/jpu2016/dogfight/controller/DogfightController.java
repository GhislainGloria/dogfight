package jpu2016.dogfight.controller;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.Missile;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer{
	private static int TIME_SLEEP = 30;
	private IViewSystem viewSystem;
	private IDogfightModel dogfightmodel;
	
	public DogfightController(IDogfightModel dogfightmodel){
		this.dogfightmodel = dogfightmodel;
	}
	
	public void orderPerform(UserOrder userOrder){
		
	}
	
	public void play(){
		
	}
	
	public void setViewSystem(IViewSystem viewSystem){
		this.viewSystem = viewSystem;
	}
	
	private void lauchMissile(int player){
		Missile missile = new Missile();
	}
	
	private void gameLoop(){
		
	}
}
