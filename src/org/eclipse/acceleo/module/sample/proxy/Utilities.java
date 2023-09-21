package org.eclipse.acceleo.module.sample.proxy;

public class Utilities {
	public String toCamelHump(String input) {
		StringBuilder builder = new StringBuilder();
        String[] words = input.split("[\\W_]+");
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (i == 0) {
                word = word.isEmpty() ? word : word.toLowerCase();
            } else {
                word = word.isEmpty() ? word : Character.toUpperCase(word.charAt(0)) + word.substring(1).toLowerCase();
            }
            builder.append(word);
        }
        return builder.toString();
	}
}
