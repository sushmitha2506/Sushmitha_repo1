git is a distributed version controlling system
git architecture mainly consists of three components
1.working directory
2.stagging area
3.local repository

state of files under working directory is untracked
state of files under stagging area is stagged 
state of files under local repo is committed

to move files from working area to stagging area we have to used git add command
to move files from stgged area to loacl repo git commit -m "message" can be used
to bring back files from stagging area to working directory we have to used git reset <file_name> command

git init will initialize the empty git repo inside our current working directory, it will convert the working directory into git workspace

git status will display where our files are current in i.e whether in working directory or stgging area or local repo

git log will display the commit history,HEAD represents or points to recent commit

remote repo is a centralized place where all source code related to project will be kept
