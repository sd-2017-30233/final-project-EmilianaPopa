package Pattern;
import java.util.*;

import Model.Diagnosis;

public interface Filter {
	public List<Diagnosis> metCriteria(List<Diagnosis> items);
}
