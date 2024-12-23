void main() {
  List<List<int>> matrix = [
    [1, 10, 4, 2],
    [9, 3, 8, 7],
    [15, 16, 17, 12],
  ];

  print(luckyNumbers(matrix));
}

List<int> luckyNumbers(List<List<int>> matrix) {
  List<int> luckyNumber = [];
  for (int i = 0; i < matrix.length; i++) {
    int minInRow = 99999;
    int lowestIndex = 0;

    ///find the lowest value and value index
    for (int j = 0; j < matrix[i].length; j++) {
      if (minInRow > matrix[i][j]) {
        minInRow = matrix[i][j];
        lowestIndex = j;
      }
    }

    ///find the highest value in the column of lowest value
    int maxInCol = -99999;
    for (int k = 0; k < matrix.length; k++) {
      if (maxInCol < matrix[k][lowestIndex]) {
        maxInCol = matrix[k][lowestIndex];
      }
    }
    // print("Min in Row: $minInRow");
    // print("Max in Col: $maxInCol");

    //check if the lowest value in the row is equal to
    //the highest value in the column
    if (minInRow == maxInCol) {
      luckyNumber.add(maxInCol);
    }
  }
  return luckyNumber;
}
