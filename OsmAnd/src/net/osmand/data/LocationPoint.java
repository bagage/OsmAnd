package net.osmand.data;

import android.content.Context;

import java.io.Serializable;


/**
 */
public interface LocationPoint extends Serializable {

	public double getLatitude();

	public double getLongitude();

	public int getColor();
	
	public boolean isVisible();
	
	public PointDescription getPointDescription(Context ctx);

//	public String getSpeakableName();
	
	//public void prepareCommandPlayer(CommandBuilder cmd, String names);
	
}
