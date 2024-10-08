package rest.warehouse;

import rest.model.ElectionData;

import java.util.ArrayList;
import java.util.List;

public class ElectionSimulation {

	private double getRandomDouble( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum;
		double rounded = Math.round(number * 100.0) / 100.0;
		return rounded;

	}

	private int getRandomInt( int inMinimum, int inMaximum ) {

		double number = ( Math.random() * ( (inMaximum-inMinimum) + 1 )) + inMinimum;
		Long rounded = Math.round(number);
		return rounded.intValue();

	}

	public ElectionData getData(String inID ) {

		List<Party> countingData = new ArrayList<Party>();
		Vorzugsstimmen vorzugsstimme1 = new Vorzugsstimmen(1,"Vincent Weinzinger",getRandomInt(0,300));
		Vorzugsstimmen vorzugsstimme2 = new Vorzugsstimmen(2,"Gustav Glatzl",getRandomInt(0,200));
		Vorzugsstimmen vorzugsstimme3 = new Vorzugsstimmen(3,"Nico Furtner",getRandomInt(0,100));
		List<Vorzugsstimmen> vorzugsstimmenFPÖ = new ArrayList<>();
		vorzugsstimmenFPÖ.add(vorzugsstimme1);
		vorzugsstimmenFPÖ.add(vorzugsstimme2);
		vorzugsstimmenFPÖ.add(vorzugsstimme3);
		List<Vorzugsstimmen> vorzugsstimmenSPÖ = new ArrayList<>();
		vorzugsstimmenSPÖ.add(vorzugsstimme1);
		vorzugsstimmenSPÖ.add(vorzugsstimme2);
		vorzugsstimmenSPÖ.add(vorzugsstimme3);
		List<Vorzugsstimmen> vorzugsstimmenÖVP = new ArrayList<>();
		vorzugsstimmenÖVP.add(vorzugsstimme1);
		vorzugsstimmenÖVP.add(vorzugsstimme2);
		vorzugsstimmenÖVP.add(vorzugsstimme3);

		countingData.add(new Party("FPÖ", getRandomInt(0,1000),vorzugsstimmenFPÖ));
		countingData.add(new Party("SPÖ", getRandomInt(0,1000),vorzugsstimmenSPÖ));
		countingData.add(new Party("ÖVP", getRandomInt(0,1000),vorzugsstimmenÖVP));
		ElectionData data = new ElectionData();
		data.setRegionID(""+this.getRandomInt(100,200));
		data.setRegionName( "Wien 20.Bezirk." );
		data.setFederalState("Austria");
		data.setRegionAddress("Wexstraße 19-23");
		data.setRegionPostalCode("Wien");
		data.setCountingData(countingData);
		return data;

	}

}
