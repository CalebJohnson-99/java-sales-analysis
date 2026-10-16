Test 1 (data set): input {12, -8, 15, 18, -22, 10, 14, -5, 20, 8, -25, 6} 
Expected result: start Jan, end Oct, total = 62.0 million
actual result: matched expected.
Pass

Test 2 (single month): input {-10, 50, -10, -10, -10, -10, -10, -10, -10, -10, -10, -10}
Expected result: start Feb, end Feb, total = 50.0 million
actual result: matched expected.
Pass

Test 3 (all negative): input {-10, -5, -10, -10, -10, -10, -10, -10, -10, -10, -10, -10}
expected result: start Feb, end Feb, total = -5.0 million
actual result: matched expected.
Pass

Test 4 (Best start at Jan) input: {20, 12, -8, 15, 18, -22, 10, 14, -5, 8, -25, 6}
Expected result: start Jan, end Oct, total = 62.0 million
actual result: matched expected.
Pass

Test 5 (Best end at Dec) input: {-25, 12, -8, -22, 15, 18, 10, 14, -5, 6, 8, 20}
Expected result: start May, end Dec, total = 86.0 million
actual result: matched expected.
Pass

Test 6 (tie rule) input: {10, -10, 1, -1, 1, -1, 1, -1, 1, -1, 10, -10}
expected result: start Jan, end Jan, total = 10.0 million
actual result: matched expected.
Pass
