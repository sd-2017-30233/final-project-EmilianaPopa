package Pattern;

import java.util.ArrayList;
import java.util.List;

import Model.Diagnosis;

public class RacealaFilter implements Filter{

	@Override
	public List<Diagnosis> metCriteria(List<Diagnosis> items) {
		List<Diagnosis> lista=new ArrayList<>();
		for(Diagnosis d: items)
		{
			if(d.getSimptom().equals("raceala"))
			{
				lista.add(d);
			}
		}
		return lista;
	}
	
}
