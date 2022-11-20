package de.sda.novel;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class NameReplacementServiceImpl implements NameReplacementService {

	private List<String> availablePersonNames;
	private List<String> availablePlaceNames;
	private Map<String, String> personNameCache = new HashMap<String, String>();
	private Map<String, String> placeNameCache = new HashMap<String, String>();
	private Random random = new Random();
	
	public NameReplacementServiceImpl(List<String> personNames, List<String> placeNames) {
		this.availablePersonNames = personNames;
		this.availablePlaceNames = placeNames;
	}

	@Override
	public String replacePlaceName(String originalPlaceName) {
		
		if(placeNameCache.containsKey(originalPlaceName)) {
			return placeNameCache.get(originalPlaceName);
		} else {
			String replacedName = availablePlaceNames.get(random.nextInt(availablePlaceNames.size()));
			placeNameCache.put(originalPlaceName, replacedName);
			return replacedName;
		}
	}

	@Override
	public String replacePersonName(String originalPersonName) {
		if(placeNameCache.containsKey(originalPersonName)) {
			return personNameCache.get(originalPersonName);
		} else {
			String replacedName = availablePersonNames.get(random.nextInt(availablePersonNames.size()));
			personNameCache.put(originalPersonName, replacedName);
			return replacedName;
		}
	}
	
}
