void main() {
  String name = "Injamul Haq Sohag";
  print(reverse(value: name));
}

String reverse({required String value}) {
  String ans = "";
  for (int i = value.length - 1; i >= 0; i--) {
    ans += value[i];
  }
  return ans;
}
