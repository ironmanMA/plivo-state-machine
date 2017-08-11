# plivo-state-machine
plivo state machine with CRUD
edit 

--- USAGE ---

Enter your action

add   : adds new state

link   : adds new link, b/w states

move    : move to new state

show    : show current and previous state(s)

show_all: show all state(s)

exit: exit

--- COMMAND LIST---

add s1

add s2

link s1 s2

move s1
Initiated Transition s1
Hitting callback from State:s1

show
Current State: s1
Path till current state: s1

move s2
Hitting callback from State:s1, To:s2

show
Current State: s2
Path till current state: s2 <= s1
