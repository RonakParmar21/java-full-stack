/**
 *  Everything in javascript happens inside an execution context.
 * -> Assume this execution context to be a big box or a container in which javascript code is executed.
 * -> Execution context looks like 2 components :-
 * -> 1st is memory component / memory part -> also known as variable environment.
 * -> 2nd is code component / code part -> also known as thread of execution. and is just like a thread in which whole code is executed line by line.
 * 
 * -> Execution context has 2 phases :-
 * -> 1st is creation phase :-
 *      -> In this phase memory component is created.
 *      -> In this phase, memory is allocated for all the variables and functions present in the code.
 *     -> All the function declarations are stored in memory part with their entire function definition.
 *    -> All the variable declarations are stored in memory part with an initial value of 'undefined'.
 * -> 2nd is execution phase :-
 *     -> In this phase code component is executed line by line.
 *    -> In this phase, memory part is accessed to get the values of variables and functions to execute the code.
 * 
 */