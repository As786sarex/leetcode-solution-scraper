const fs = require('fs');

const outputStream = fs.createWriteStream('./solutions/custom.java', { flags: 'a' });
for (let i = 0; i < 50; i++) {
    const element = i + "const outputStream = fs.createWriteStream('./solutions/myfab.java', { flags: 'a' });\n";
    outputStream.write(element);
}
outputStream.close();