// https://leetcode.com/problems/add-to-array-form-of-integer/

void main() {
  List<int> num = [1, 2, 3, 4, 5];
  int k = 98765;

  List<int> result = addToArrayForm(num, k);
  print(result);
}

List<int> addToArrayForm(List<int> num, int k) {
  BigInt number = BigInt.zero;
  String n = "";

  // Convert the array into a string representation of the number
  for (int i = 0; i < num.length; i++) {
    n += num[i].toString();
  }

  // Convert the string to a BigInt and add k
  BigInt s = BigInt.parse(n);
  number = s + BigInt.from(k);

  // Convert the result back to a list of integers
  List<int> result = number.toString().split("").map(int.parse).toList();

  return result;
}
