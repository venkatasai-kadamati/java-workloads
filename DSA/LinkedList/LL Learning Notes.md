# Notes 1 : Two-Pointer Loop Condition Notes

> Helps to understand the loop condition creation and how to be safe while doing next.next operations.

> Super helpful for deleting middle node in LL by using fast and slow pointers.

## Loop Condition: `while(end != null && end.next != null)`

### **Core Logic**

- **Fast pointer** (`end`) moves 2 steps at a time
- **Must check if 2 steps are possible** before moving
- Stop when fast pointer **cannot take 2 full steps**

### **Condition Breakdown**

| Condition          | Purpose                              | Scenario                          |
|--------------------|--------------------------------------|-----------------------------------|
| `end != null`      | Check if **current position exists** | Prevents accessing null.next      |
| `end.next != null` | Check if **next position exists**    | Prevents accessing null.next.next |

### **List Type Handling**

**Odd Length Lists** (1→2→3→4→5):

- Fast pointer lands on **last node** (node 5)
- `end != null` ✓, but `end.next == null` ✗
- **Loop stops**, slow pointer at **exact middle**

**Even Length Lists** (1→2→3→4):

- Fast pointer lands on **second-last node** (node 3)
- `end != null` ✓, `end.next != null` ✓
- **Next iteration**: fast moves to null, loop stops
- **Slow pointer at first middle** (for deletion)

### **Safety Rule**

> **"Can I take 2 steps?"** - If either step is impossible, stop traversal

### **Memory Aid**

*"Fast runner stops when track has less than 2 blocks ahead"*