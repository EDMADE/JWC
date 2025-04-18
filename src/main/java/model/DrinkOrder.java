package model;

import java.util.Map;

public class DrinkOrder {
	private String type;
	private String size;
	private boolean ice;
	private int price;
	
	// 價格對照表
	private static final Map<String, Map<String, Integer>> priceTable = Map.of(
			"greenTea", Map.of("S", 30, "M", 50, "L", 50),
			"blackTea", Map.of("S", 45, "M", 55, "L", 65),
			"milkTea", Map.of("S", 40, "M", 45, "L", 60));
	
	private static final Map<String, String> sizeTable = Map.of("S", "小", "M", "中", "L", "大");
	private static final Map<Boolean, String> sugarTable = Map.of(true, "有加冰", false, "去冰");
	
	public DrinkOrder(String type, String size, String ice) {
		this.type = type;
		this.size = size;
		this.ice = Boolean.parseBoolean(ice);
		this.price = priceTable.get(type.toLowerCase()).get(size);
	}
}
