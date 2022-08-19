echo "Moving to src/main/js to checkout projects."
cd ../src/main/js
echo "Checking out v3-periphery"
# git clone --depth=1 https://github.com/Uniswap/v3-periphery.git
echo "Checking out v3-periphery"
# git clone --depth=1 https://github.com/Uniswap/v2-periphery.git
echo "Checking out v3-core"
# git clone --depth=1 https://github.com/Uniswap/v3-core.git
echo "Checking out v2-core"
# git clone --depth=1 https://github.com/Uniswap/v2-core.git
cd v3-periphery
echo "NPM Init v3-periphery"
npm i
cd ..
cd v2-periphery
echo "NPM Init v2-periphery"
npm i
cd ..