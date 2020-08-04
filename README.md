# Circular buffer

### 1. Data structure ? (Internal)

- Array of String

### 2. Operations/Behavior/Methods ? user -> CB ?

- writeData(string):void
- readData(): string
- isFull(): boolean-> เช็คว่า buffer เต็มรึยัง
- isEmpty(): boolean-> เช็คว่า buffer ว่างรึยัง
- setSize(int): void

### 3. Internal process ?

- buffer size = 10 (default)
- read pointer = 0
- write pointer = 0

### 4.List of test cases

- TC01 => create_new_buffer_should_empty
- TC02 => create_new_buffer_with_default_size_should_10
- TC03 => write_A_B_to_buffer_should_read_A_B_from_buffer
- TC04 => write_data_should_not_over_buffer_size

### Refector code

problem => duplicate conditions statement in getScore()

- player1Point > 0 && player2Point ==0
- player2Point > 0 && player1Point ==0
- player1Point > player2Point && player1Point < 4
- player2Point > player1Point && player2Point < 4
- win and advantage condition
