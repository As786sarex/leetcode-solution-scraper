## Leetcode Solution scrapper


[![Node.js CI](https://github.com/As786sarex/leetcode-solution-scrapper/actions/workflows/node.js.yml/badge.svg)](https://github.com/As786sarex/leetcode-solution-scrapper/actions/workflows/node.js.yml)

#### This repository uses Github Action as a job executor to scrape all of your solved problems.
---
### How to setup for scraping 
- [x] Clone this repository.
- [x] Delete all files except one in `solutions` folder.
- [x] Add your specific `LEETCODE_SESSION` key in `SESSION_COOKIE` variable.
- [x] As of now you have to populate ALL_SOLUTIONS variable to url of solved problems. Urls will be in the form of `https://leetcode.com/problems/{problem-slag}`. To get all your solved problem follow [this](https://github.com/As786sarex/leetcode-solution-scrapper/master/ALL_PROBLEMS.md) instruction.
- [x] Create a remote repository in Github & set following `Setings > Secrets`
    - `SSH` to your git ssh private key `.ssh/id_rsa`.
    - `KNOWN_HOSTS` to your `.ssh/known_hosts`.
    - `SSH_URL` to you remote repository ssh url.
    - To know how to setup ssh click [here](https://docs.github.com/en/github/authenticating-to-github/connecting-to-github-with-ssh)
- [x] commit & push your code to remote repository.
- [x] Manually run Action from `Actions > Nodejs CI`.
- [x] Done.

---

### Here's some screenshot of successfully executed Github Actions job.

![Build Steps](https://raw.githubusercontent.com/As786sarex/leetcode-solution-scrapper/master/images/build-steps.png?token=AIZ5N66E3SP2EOVQB6WIWMDBBWWV6)
![Build Steps](https://raw.githubusercontent.com/As786sarex/leetcode-solution-scrapper/master/images/time_elapsed.png?token=AIZ5N65XL22MTIZRF75ZQITBBWZKC)
