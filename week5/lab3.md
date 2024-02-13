# Lab Report 3

## Part 1:

**Failure Inducing Input Test**

Input used: Integer array `{3,2,1}`

```
@Test 
public void testReverseInPlace() {
  int[] input1 = {3, 2, 1};
  ArrayExamples.reverseInPlace(input1);
  assertArrayEquals(new int[]{1, 2, 3}, input1);
}
```
**Passing Input**

Input used: Integer array of `{0}`

```
@Test 
public void testReverseInPlace() {
  int[] input1 = {0};
  ArrayExamples.reverseInPlace(input1);
  assertArrayEquals(new int[]{0}, input1);
}
```
**Symptoms**

Symptom of Failure Inducing Input:

![alt_text](FailedTest.png)

Symptom of Passing Input:

![alt_text](PassedTest.png)

**Before and After Bug was fixed**

The initial bug was that the array was being reversed without a temporary array being created to preserve the old array. For example, if the array was `{1,2,3}`, then the `reverseInPlace` method would first access the last element and change the first element to that. But when it comes time to access the first element and change the last element to that, the first element was already changed, so it would not work. That is why I created a temporary array to preserve the initial array and then reverse the initial array based on the elements in the temporary array.

Here is the method from before the bug was fixed:

```
static void reverseInPlace(int[] arr) {
  for(int i = 0; i < arr.length; i += 1) {
    arr[i] = arr[arr.length - i - 1];
  }
}
```

Here is the method after the bug was fixed:
```
static void reverseInPlace(int[] arr) {
  for(int i = 0; i < arr.length/2; i += 1) {
    int temp = arr[i];
    arr[i] = arr[arr.length - i - 1];
    arr[arr.length - i - 1] = temp;
  }
}
```
## Part 2:

### Grep Method Options:

**Option 1: ignore-case**

Example 1:
![alt_text](ignorecase1.png)

Example 2:
![alt_text](ignorecase2.png)

**Option 2: invert-match**

Example 1:
![alt_text](invertmatch1.png)

Example 2:
![alt_text](invertmatch2.png)

**Option 3: count**

Example 1:
![alt_text](count1.png)

Example 2:
![alt_text](count2.png)

**Option 4: max-count**

Example 1:
![alt_text](maxcount1.png)

Example 2:
![alt_text](maxcount2.png)

