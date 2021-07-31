const puppeteer = require('puppeteer');
const fs = require('fs');

const SESSION_COOKIE = [{
    domain: '.leetcode.com',
    expirationDate: 1597288045,
    hostOnly: false,
    httpOnly: true,
    name: 'LEETCODE_SESSION',
    path: '/',
    sameSite: 'Lax',
    secure: true,
    session: true,
    storeId: '0',
    value: '',  //add your token
    id: 1
}];

const SELECTORS = {
    AC_SUBMISION: '.ac_35gz',
    PROBLEM_NAME: '.inline-wrap',
    SOLUTION_LINE: '.ace_line',
    EXTENSION: '#result_language'
};

async function createPdfForEveryACSubmission(page, problem) {
    try {
        await page.goto(`${problem}/submissions`, { waitUntil: 'networkidle0' });
        const allACSubmissions = await page.evaluate(() => Array.from(document.querySelectorAll('.ac__35gz'), element => element.href));
        await page.goto(allACSubmissions[0], { waitUntil: 'networkidle0' });
        const problemNames = await page.evaluate(() => Array.from(document.querySelectorAll('.inline-wrap'), element => element.innerText));
        const problemExtestion = await page.evaluate(() => Array.from(document.querySelectorAll('#result_language'), element => element.innerText));
        const solutionLines = await page.evaluate(() => Array.from(document.querySelectorAll('.ace_line'), element => element.innerText));

        const filePath = `./solutions/${problemNames[0]}.${problemExtestion[0]}`;
        const writeStream = fs.createWriteStream(filePath, { flags: 'a' });
        for (const line of solutionLines) {
            writeStream.write(line + '\n');
        }
        writeStream.close();
        console.log(`source creation is completed for ${filePath}`);
    } catch (e) {
        console.log(`Exception occurred for ${problem}, ${e}`);
    }
}

(
    async () => {
        const browser = await puppeteer.launch();
        const page = await browser.newPage();
        await page.setCookie(...SESSION_COOKIE);

        for (const problem of ALL_PROBLEMS) {
            await createPdfForEveryACSubmission(page, problem);
        }

        //close page & browser
        await page.close();
        await browser.close();
    }
)();

const ALL_PROBLEMS = [
    "https://leetcode.com/problems/two-sum",
    "https://leetcode.com/problems/add-two-numbers",
    "https://leetcode.com/problems/longest-substring-without-repeating-characters",
    "https://leetcode.com/problems/string-to-integer-atoi",
    "https://leetcode.com/problems/palindrome-number",
    "https://leetcode.com/problems/container-with-most-water",
    "https://leetcode.com/problems/integer-to-roman",
    "https://leetcode.com/problems/longest-common-prefix",
    "https://leetcode.com/problems/3sum",
    "https://leetcode.com/problems/3sum-closest",
    "https://leetcode.com/problems/letter-combinations-of-a-phone-number",
    "https://leetcode.com/problems/valid-parentheses",
    "https://leetcode.com/problems/merge-two-sorted-lists",
    "https://leetcode.com/problems/generate-parentheses",
    "https://leetcode.com/problems/merge-k-sorted-lists",
    "https://leetcode.com/problems/swap-nodes-in-pairs",
    "https://leetcode.com/problems/remove-duplicates-from-sorted-array",
    "https://leetcode.com/problems/remove-element",
    "https://leetcode.com/problems/divide-two-integers",
    "https://leetcode.com/problems/next-permutation",
    "https://leetcode.com/problems/search-in-rotated-sorted-array",
    "https://leetcode.com/problems/search-insert-position",
    "https://leetcode.com/problems/combination-sum-ii",
    "https://leetcode.com/problems/trapping-rain-water",
    "https://leetcode.com/problems/jump-game-ii",
    "https://leetcode.com/problems/permutations",
    "https://leetcode.com/problems/rotate-image",
    "https://leetcode.com/problems/group-anagrams",
    "https://leetcode.com/problems/powx-n",
    "https://leetcode.com/problems/maximum-subarray",
    "https://leetcode.com/problems/jump-game",
    "https://leetcode.com/problems/merge-intervals",
    "https://leetcode.com/problems/spiral-matrix-ii",
    "https://leetcode.com/problems/permutation-sequence",
    "https://leetcode.com/problems/unique-paths",
    "https://leetcode.com/problems/unique-paths-ii",
    "https://leetcode.com/problems/minimum-path-sum",
    "https://leetcode.com/problems/climbing-stairs",
    "https://leetcode.com/problems/simplify-path",
    "https://leetcode.com/problems/set-matrix-zeroes",
    "https://leetcode.com/problems/search-a-2d-matrix",
    "https://leetcode.com/problems/sort-colors",
    "https://leetcode.com/problems/subsets",
    "https://leetcode.com/problems/gray-code",
    "https://leetcode.com/problems/subsets-ii",
    "https://leetcode.com/problems/binary-tree-inorder-traversal",
    "https://leetcode.com/problems/unique-binary-search-trees",
    "https://leetcode.com/problems/validate-binary-search-tree",
    "https://leetcode.com/problems/recover-binary-search-tree",
    "https://leetcode.com/problems/same-tree",
    "https://leetcode.com/problems/binary-tree-level-order-traversal",
    "https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal",
    "https://leetcode.com/problems/maximum-depth-of-binary-tree",
    "https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal",
    "https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal",
    "https://leetcode.com/problems/binary-tree-level-order-traversal-ii",
    "https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree",
    "https://leetcode.com/problems/flatten-binary-tree-to-linked-list",
    "https://leetcode.com/problems/populating-next-right-pointers-in-each-node",
    "https://leetcode.com/problems/pascals-triangle",
    "https://leetcode.com/problems/pascals-triangle-ii",
    "https://leetcode.com/problems/best-time-to-buy-and-sell-stock",
    "https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii",
    "https://leetcode.com/problems/word-ladder",
    "https://leetcode.com/problems/longest-consecutive-sequence",
    "https://leetcode.com/problems/clone-graph",
    "https://leetcode.com/problems/single-number",
    "https://leetcode.com/problems/word-break",
    "https://leetcode.com/problems/lru-cache",
    "https://leetcode.com/problems/reverse-words-in-a-string",
    "https://leetcode.com/problems/find-minimum-in-rotated-sorted-array",
    "https://leetcode.com/problems/two-sum-ii-input-array-is-sorted",
    "https://leetcode.com/problems/majority-element",
    "https://leetcode.com/problems/excel-sheet-column-number",
    "https://leetcode.com/problems/factorial-trailing-zeroes",
    "https://leetcode.com/problems/binary-search-tree-iterator",
    "https://leetcode.com/problems/second-highest-salary",
    "https://leetcode.com/problems/employees-earning-more-than-their-managers",
    "https://leetcode.com/problems/reverse-bits",
    "https://leetcode.com/problems/number-of-1-bits",
    "https://leetcode.com/problems/house-robber",
    "https://leetcode.com/problems/binary-tree-right-side-view",
    "https://leetcode.com/problems/number-of-islands",
    "https://leetcode.com/problems/happy-number",
    "https://leetcode.com/problems/course-schedule",
    "https://leetcode.com/problems/implement-trie-prefix-tree",
    "https://leetcode.com/problems/minimum-size-subarray-sum",
    "https://leetcode.com/problems/course-schedule-ii",
    "https://leetcode.com/problems/kth-largest-element-in-an-array",
    "https://leetcode.com/problems/invert-binary-tree",
    "https://leetcode.com/problems/majority-element-ii",
    "https://leetcode.com/problems/kth-smallest-element-in-a-bst",
    "https://leetcode.com/problems/power-of-two",
    "https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree",
    "https://leetcode.com/problems/delete-node-in-a-linked-list",
    "https://leetcode.com/problems/product-of-array-except-self",
    "https://leetcode.com/problems/sliding-window-maximum",
    "https://leetcode.com/problems/search-a-2d-matrix-ii",
    "https://leetcode.com/problems/missing-number",
    "https://leetcode.com/problems/first-bad-version",
    "https://leetcode.com/problems/move-zeroes",
    "https://leetcode.com/problems/find-the-duplicate-number",
    "https://leetcode.com/problems/game-of-life",
    "https://leetcode.com/problems/longest-increasing-subsequence",
    "https://leetcode.com/problems/range-sum-query-immutable",
    "https://leetcode.com/problems/coin-change",
    "https://leetcode.com/problems/reconstruct-itinerary",
    "https://leetcode.com/problems/counting-bits",
    "https://leetcode.com/problems/flatten-nested-list-iterator",
    "https://leetcode.com/problems/power-of-four",
    "https://leetcode.com/problems/reverse-string",
    "https://leetcode.com/problems/top-k-frequent-elements",
    "https://leetcode.com/problems/valid-perfect-square",
    "https://leetcode.com/problems/split-array-largest-sum",
    "https://leetcode.com/problems/partition-equal-subset-sum",
    "https://leetcode.com/problems/pacific-atlantic-water-flow",
    "https://leetcode.com/problems/n-ary-tree-level-order-traversal",
    "https://leetcode.com/problems/non-overlapping-intervals",
    "https://leetcode.com/problems/arranging-coins",
    "https://leetcode.com/problems/find-all-duplicates-in-an-array",
    "https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array",
    "https://leetcode.com/problems/sort-characters-by-frequency",
    "https://leetcode.com/problems/k-diff-pairs-in-an-array",
    "https://leetcode.com/problems/01-matrix",
    "https://leetcode.com/problems/diameter-of-binary-tree",
    "https://leetcode.com/problems/subarray-sum-equals-k",
    "https://leetcode.com/problems/reshape-the-matrix",
    "https://leetcode.com/problems/n-ary-tree-postorder-traversal",
    "https://leetcode.com/problems/course-schedule-iii",
    "https://leetcode.com/problems/maximum-length-of-pair-chain",
    "https://leetcode.com/problems/2-keys-keyboard",
    "https://leetcode.com/problems/maximum-width-of-binary-tree",
    "https://leetcode.com/problems/non-decreasing-array",
    "https://leetcode.com/problems/second-minimum-node-in-a-binary-tree",
    "https://leetcode.com/problems/baseball-game",
    "https://leetcode.com/problems/max-area-of-island",
    "https://leetcode.com/problems/find-pivot-index",
    "https://leetcode.com/problems/asteroid-collision",
    "https://leetcode.com/problems/min-cost-climbing-stairs",
    "https://leetcode.com/problems/partition-labels",
    "https://leetcode.com/problems/jewels-and-stones",
    "https://leetcode.com/problems/letter-case-permutation",
    "https://leetcode.com/problems/binary-tree-pruning",
    "https://leetcode.com/problems/backspace-string-compare",
    "https://leetcode.com/problems/peak-index-in-a-mountain-array",
    "https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree",
    "https://leetcode.com/problems/middle-of-the-linked-list",
    "https://leetcode.com/problems/long-pressed-name",
    "https://leetcode.com/problems/binary-subarrays-with-sum",
    "https://leetcode.com/problems/reorder-data-in-log-files",
    "https://leetcode.com/problems/squares-of-a-sorted-array",
    "https://leetcode.com/problems/minimum-cost-for-tickets",
    "https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree",
    "https://leetcode.com/problems/cousins-in-binary-tree",
    "https://leetcode.com/problems/rotting-oranges",
    "https://leetcode.com/problems/find-the-town-judge",
    "https://leetcode.com/problems/complement-of-base-10-integer",
    "https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60",
    "https://leetcode.com/problems/capacity-to-ship-packages-within-d-days",
    "https://leetcode.com/problems/last-stone-weight",
    "https://leetcode.com/problems/height-checker",
    "https://leetcode.com/problems/defanging-an-ip-address",
    "https://leetcode.com/problems/longest-common-subsequence",
    "https://leetcode.com/problems/number-of-dice-rolls-with-target-sum",
    "https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii",
    "https://leetcode.com/problems/count-vowels-permutation",
    "https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses",
    "https://leetcode.com/problems/count-square-submatrices-with-all-ones",
    "https://leetcode.com/problems/reduce-array-size-to-the-half",
    "https://leetcode.com/problems/angle-between-hands-of-a-clock",
    "https://leetcode.com/problems/time-needed-to-inform-all-employees",
    "https://leetcode.com/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree",
    "https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards",
    "https://leetcode.com/problems/count-good-nodes-in-binary-tree",
    "https://leetcode.com/problems/maximum-area-of-a-piece-of-cake-after-horizontal-and-vertical-cuts",
    "https://leetcode.com/problems/running-sum-of-1d-array",
    "https://leetcode.com/problems/the-kth-factor-of-n",
    "https://leetcode.com/problems/number-of-good-pairs",
    "https://leetcode.com/problems/number-of-substrings-with-only-1s",
    "https://leetcode.com/problems/richest-customer-wealth",
    "https://leetcode.com/problems/longest-substring-of-all-vowels-in-order",
    "https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters",
    "https://leetcode.com/problems/minimize-maximum-pair-sum-in-array",
    "https://leetcode.com/problems/merge-triplets-to-form-target-triplet",
    "https://leetcode.com/problems/maximum-product-difference-between-two-pairs",
    "https://leetcode.com/problems/cyclically-rotating-a-grid",
    "https://leetcode.com/problems/build-array-from-permutation",
    "https://leetcode.com/problems/count-good-numbers",
    "https://leetcode.com/problems/count-square-sum-triples",
    "https://leetcode.com/problems/concatenation-of-array"
];
