#!/bin/bash
f1()
{
    echo "Hello Boy";
    
    f2()
    {
        echo "Welcome to Hell";
    }
    f2
}
f1