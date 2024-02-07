# Lab Report 3

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

![alt_text](PassingInput.png)
