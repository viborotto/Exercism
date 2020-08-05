class IsogramChecker {

    boolean isIsogram(String phrase) {
      phrase = phrase.replaceAll("[\\W]", "").toLowerCase();
      return phrase.length() == phrase.chars().distinct().count() ? true : false;
    }

}
