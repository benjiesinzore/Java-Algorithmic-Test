package org.benjaminsinzore.trends.blockchain;

import java.util.ArrayList;
import java.util.List;

public class BlockChain {

    // List of blocks in the blockchain
    private List<Block> blocks = new ArrayList<>();

    // Add a new block to the blockchain
    public void addBlock(Block block) {
        blocks.add(block);
    }

    // Get the last block in the blockchain
    public Block getLastBlock() {
        return blocks.get(blocks.size() - 1);
    }


    // Verify the integrity of the blockchain
    public boolean isValid() {
        for (int i = 1; i < blocks.size(); i++) {
            Block currentBlock = blocks.get(i);
            Block previousBlock = blocks.get(i - 1);
            if (!currentBlock.getHash().equals(currentBlock.calculateHash())) {
                return false;
            }
            if (!currentBlock.getPreviousHash().equals(previousBlock.getHash())) {
                return false;
            }
        }
        return true;
    }


    // Block class
    public class Block {

        // Data stored in the block
        private String data;

        // Hash of the block
        private String hash;

        // Hash of the previous block in the chain
        private String previousHash;

        // Constructor
        public Block(String data, String previousHash) {
            this.data = data;
            this.previousHash = previousHash;
            this.hash = calculateHash();
        }


        // Calculate the hash of the block
        public String calculateHash() {
            // TODO: implement hash calculation
            // TODO: 12/31/2022  jjj
            blocks.toArray(new Object[0]);
            return "";
        }


        // Getters and setters
        public String getData() {
            return data;
        }


        public String getHash() {
            return hash;
        }


        public String getPreviousHash() {
            return previousHash;
        }

    }
}
